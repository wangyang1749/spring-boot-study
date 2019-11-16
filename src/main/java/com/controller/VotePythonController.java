package com.controller;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import com.pojo.ZDOrder;

@Controller
@RequestMapping("/vote")
public class VotePythonController {

    @RequestMapping("/ch")
//    @ResponseBody
    public String getVote(Model model){
        JSONObject jsonObject = new JSONObject(remoteCall(12345));
        
//        return jsonObject.getString("title");
        model.addAttribute("json",jsonObject);
        return "vote";
    }
    
    @RequestMapping("/ranking")
    public String getRanking(Model model){
        JSONArray jsonArray =  new JSONArray(remoteCall(30000));
        List<ZDOrder> list = new ArrayList<ZDOrder>();
        for(int i=0;i<jsonArray.length();i++){
            ZDOrder zdOrder = new ZDOrder();
            zdOrder.setName(jsonArray.getJSONArray(i).getString(0));
            zdOrder.setVote(jsonArray.getJSONArray(i).getInt(1)); 
            list.add(zdOrder);
        }
        model.addAttribute("list",list);
        return "ranking";
    }

    private String remoteCall(int port){
        // JSONObject jsonObject = new JSONObject();
        // jsonObject.put("content", content);
        // String str = jsonObject.toJSONString();
        // 访问服务进程的套接字
        Socket socket = null;
        // List<Question> questions = new ArrayList<>();
        // log.info("调用远程接口:host=>"+HOST+",port=>"+PORT);
        try {
            // 初始化套接字，设置访问服务的主机和进程端口号，HOST是访问python进程的主机名称，可以是IP地址或者域名，PORT是python进程绑定的端口号
            socket = new Socket("127.0.1.1",port);
            // 获取输出流对象
            OutputStream os = socket.getOutputStream();
            PrintStream out = new PrintStream(os);
            // 发送内容
            out.print("{123}");
            // 告诉服务进程，内容发送完毕，可以开始处理
            out.print("over");
            // 获取服务进程的输入流
            InputStream is = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is,"utf-8"));
            String tmp = null;
            StringBuilder sb = new StringBuilder();
            // 读取内容
            while((tmp=br.readLine())!=null)
                sb.append(tmp).append('\n');

            // 解析结果
            // JSONArray res = JSON.parseArray(sb.toString());

            return sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {if(socket!=null) socket.close();} catch (IOException e) {}
            System.out.println("远程接口调用结束....");
            // log.info("远程接口调用结束.");
        }
        return null;
    }
}
