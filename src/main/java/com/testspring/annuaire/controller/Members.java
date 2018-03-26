package com.testspring.annuaire.controller;

import com.testspring.annuaire.model.Gender;
import com.testspring.annuaire.model.Member;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class Members {


    List<Member> membersList= new ArrayList<Member>(Arrays.asList(
            new Member(1, Gender.MONSIEUR, "Besson", "Luc", "1959-13-18",
                    "0000000000", "5 avenue de l'Element", "75015", "Paris"),
            new Member(2, Gender.MADAME, "Ullmann", "Liv", "1938-12-16",
                    "0101010101", "1-16-5", "22", "Tokyo"),
            new Member(3, Gender.MONSIEUR, "Lynch", "David", "1946-01-20",
                    "0202020202", "423 Fire Terrace", "59801", "Missoula")
    ));

    @GetMapping
    public List<Member> getAllRest() {
        return this.membersList;
    }

    @GetMapping("/viewPages/membersDirectory")
    public ModelAndView getAll() {
        ModelAndView mav = new ModelAndView("viewPages/membersDirectory");
        mav.addObject("membersList", membersList);
        return mav;
    }

    @RequestMapping(value="/viewPages/membersDirectory}", method=RequestMethod.GET)
    public ModelAndView getForm() {
        return new ModelAndView("viewPages/registration");
    }

    @RequestMapping(value="/viewPages/membersDirectory}", method=RequestMethod.POST)
    public void addForm(@ModelAttribute Member member) {
        member.setId(membersList.size()+1);
        membersList.add(member);
    }


    @RequestMapping(value="/viewPages/membersDirectory/{id}", method=RequestMethod.GET)
    public ModelAndView getById(@PathVariable Integer id) {
        ModelAndView mav = new ModelAndView("viewPages/membersDirectory");
        for (Member member : this.membersList) {
            if (id.equals(member.getId())) {
                mav.addObject("member", member);
                return mav;
            }
        }
        return null;
    }
}