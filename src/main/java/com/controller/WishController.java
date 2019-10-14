package com.controller;

import com.pojo.Wish;
import com.repository.WishRepository;
import org.hibernate.criterion.Example;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller

@RequestMapping("/wish")
@CrossOrigin()
public class WishController {

    @Autowired
    private WishRepository wishRepository;
    @RequestMapping(value = "/add")
    @ResponseBody
    public String addWish( Wish wish){
        System.out.println(wish.getMessage());
        wishRepository.save(wish);
        return "success";
    }
    @RequestMapping("/list")
    @ResponseBody
    public List<String> listWish(){
        List<String> wishes = wishRepository.findAllMessage();
        return wishes;
    }
    @RequestMapping("/delWish/{id}")
    public String delWish(@PathVariable(name = "id") int id){
        Wish wish = new Wish();
        wish.setId(id);
        wishRepository.delete(wish);
        return "redirect:/wish/listAll";
    }
    @RequestMapping(value = "/add_h")
    public String addWish_h( Wish wish){
        wishRepository.save(wish);
        return "redirect:/wish/listAll";
    }
    @RequestMapping("/listAll")
    public String ListAllWish(Model model){
        List<Wish> wishes = wishRepository.findAll();
        model.addAttribute("wishes",wishes);
        return "wishList";
    }
}
