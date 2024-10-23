package com.fstg.locationvoiture.Controller;

import com.fstg.locationvoiture.Entity.Product;
import com.fstg.locationvoiture.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductController {
    @Autowired

    private ProductService productService;

    @RequestMapping("/addProduct")
    public String addProduct(Model model){
        Product product1 = new Product();
        model.addAttribute("ProductFomr", product1);
        return "New_product";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveProduct(@ModelAttribute("ProductFomr")  Product product1){
        productService.save(product1);
        return "redirect:/all";

    }
}
