package com.shenhu.hotel.web;

import com.shenhu.hotel.entity.Hotel;
import com.shenhu.hotel.service.HotelService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class HotelController {

    @Resource
    HotelService hotelService;


    @RequestMapping("/")
    public String index() {
        return "redirect:/list";
    }

    @RequestMapping("/list")
    public String list(Model model) {
        List<Hotel> hotels= hotelService.getHotelList();
        model.addAttribute("hotels", hotels);
        return "hotel/list";
    }

    @RequestMapping("/toAdd")
    public String toAdd() {
        return "hotel/hotelAdd";
    }

    @RequestMapping("/add")
    public String add(Hotel hotel) {
        hotelService.save(hotel);
        return "redirect:/list";
    }

    @RequestMapping("/toEdit")
    public String toEdit(Model model,Long id) {
        Hotel hotel= hotelService.findHotelById(id);
        model.addAttribute("hotel", hotel);
        return "hotel/hotelEdit";
    }

    @RequestMapping("/edit")
    public String edit(Hotel hotel) {
        hotelService.edit(hotel);
        return "redirect:/list";
    }


    @RequestMapping("/delete")
    public String delete(Long id) {
        hotelService.delete(id);
        return "redirect:/list";
    }
}
