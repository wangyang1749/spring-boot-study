package com.controller;

import com.algorithm.NeedlemanWunsch;
import com.algorithm.OptimalAlignment;
import com.pojo.NeedlemanWunshDTO;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NeedlemanWunschController {

    @RequestMapping("/nw")
    public String comparision(String sequence1, String sequence2, @RequestParam(defaultValue = "4") int match, @RequestParam(defaultValue = "-3")int mismatch, @RequestParam(defaultValue = "-4")int gap, Model model ){
        NeedlemanWunshDTO needlemanWunshDTO = doComparision(sequence1, sequence2,match,mismatch,gap);
        model.addAttribute("nws",needlemanWunshDTO);
        model.addAttribute("sequence1",sequence1);
        model.addAttribute("sequence2",sequence2);

        return "needlemanWunsch";
    }
    @RequestMapping(value = "nwSubmit",params = "json")
    @ResponseBody
    public NeedlemanWunshDTO comparisionJson(String sequence1, String sequence2,@RequestParam(defaultValue = "4") int match, @RequestParam(defaultValue = "-3")int mismatch, @RequestParam(defaultValue = "-4")int gap){

        return doComparision(sequence1,sequence2,match,mismatch,gap);
    }
    public NeedlemanWunshDTO doComparision(String sequence1, String sequence2,int match,int mismatch,int gap){
        NeedlemanWunshDTO needlemanWunshDTO=null;
        float matchScore = 4;
        float mismatchScore = -3;
        float indelScore = -4;
        if(sequence1!=null&&sequence2!=null&&!"".equals(sequence1)&&!"".equals(sequence2)){
            needlemanWunshDTO= new NeedlemanWunshDTO();
            float[][]  computedMatrix = NeedlemanWunsch.computeMatrix(sequence1, sequence2, matchScore, mismatchScore, indelScore);
            OptimalAlignment optimalAlignment = NeedlemanWunsch.obtainOptimalAlignmentByDownmostOrder(computedMatrix, sequence1, sequence2, matchScore, mismatchScore, indelScore);
            needlemanWunshDTO.setComputedMatrix(computedMatrix);
            needlemanWunshDTO.setResult1(optimalAlignment.getResult1());
            needlemanWunshDTO.setResult2(optimalAlignment.getResult2());
            needlemanWunshDTO.setSequence1(sequence1);
            needlemanWunshDTO.setSequence2(sequence2);

        }
        return needlemanWunshDTO;
    }


}
