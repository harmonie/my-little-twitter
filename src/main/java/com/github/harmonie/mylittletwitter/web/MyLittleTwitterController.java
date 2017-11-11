package com.github.harmonie.mylittletwitter.web;

import com.github.harmonie.mylittletwitter.db.TweetRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.inject.Inject;

@Controller
public class MyLittleTwitterController {

    private TweetRepository tweetRepository;

    @Inject
    public MyLittleTwitterController(TweetRepository tweetRepository) {
        this.tweetRepository = tweetRepository;
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public ModelAndView index(@RequestParam(name = "page", defaultValue = "0") int page) {
        ModelAndView modelAndView = new ModelAndView("index");

        modelAndView.addObject("page", page);

        return modelAndView;
    }

    @RequestMapping(path = "/tweet.html", method = RequestMethod.GET)
    public ModelAndView tweet() {

        return new ModelAndView("tweet");
    }

    @RequestMapping(path = "/tweet.html", method = RequestMethod.POST)
    public String postTweet() {

        return "redirect:/";
    }
}
