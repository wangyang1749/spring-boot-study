package com.controller;

import com.pojo.Book;
import com.repository.ReadingListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/readingList")
public class ReadingListController {

    @Autowired
    private ReadingListRepository readingListRepository;

    @RequestMapping(value = "/{reader}",method = RequestMethod.GET)
    public String readersBooks(@PathVariable("reader")String reader, Model model){
        List<Book> readerList = readingListRepository.findByRender(reader);
        if(readerList!=null){
            model.addAttribute("books",readerList);
        }
        System.out.println(readerList);
        return "readingList";
    }

    @RequestMapping(value = "/{reader}",method = RequestMethod.POST)
    public String addReadingList(@PathVariable("reader")String reader,Book book){
        book.setRender(reader);
        readingListRepository.save(book);
        return "redirect:/readingList/{reader}";
    }
}
