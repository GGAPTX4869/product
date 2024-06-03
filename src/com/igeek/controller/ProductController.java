package com.igeek.controller;

import com.igeek.entity.Product;
import com.igeek.entity.ProductWrapper;
import com.igeek.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

//    @Autowired
//    public ProductController(ProductService productService) {
//        this.productService = productService;
//    }

    // 1. 直接从HttpServletRequest获取请求参数
    @RequestMapping("/getProductId.action")
    public String getProductId(HttpServletRequest request) {
        String productId = request.getParameter("id");
        System.out.println("Product ID: " + productId);
        return "index";
    }


    // 2.使用Model并返回String来传递编辑页面的数据
    @RequestMapping("/editProduct.action")
    public String editProduct(@RequestParam("id") String id, Model model) {
        System.out.println("Received product ID: " + id);

        Product product = productService.getProductById(id);
        if (product != null) {
            model.addAttribute("product", product);
            return "editProduct";
        } else {
            System.out.println("Product not found for ID: " + id);
            return "error";
        }
    }


    // 3.使用方法参数直接接收名为“id”的参数
    @RequestMapping("/getItemById.action")
    public String getItemById(@RequestParam("id") String itemId, Model model) {
        model.addAttribute("itemId", itemId);
        System.out.println("Item ID: " + itemId);
        return "index";
    }

    // 4.使用POJ0接收产品数据
    @RequestMapping(value = "/saveProduct.action", method = RequestMethod.POST)
    public String saveProduct(Product product) {
        // Process the received product data
        productService.saveProduct(product);
        return "redirect:/product/getProductList";
    }

    // 5.为产品数据创建包装器类
    @RequestMapping("/editProductWrapper.action")
    public String editProductWrapper(ProductWrapper productWrapper) {

        Product product = productWrapper.getProduct();
        if (product != null) {
            System.out.println("Product Name: " + product.getName());
            // Process product data as needed
            return "index";
        } else {
            System.out.println("Product is null");
            return "error";
        }
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }
    //6.接收时间类型数据
    @RequestMapping("/receiveDate.action")
    public String receiveDate(@RequestParam("date") Date createDate) {
        System.out.println("Received Date: " + createDate);
        return "index";
    }

    @RequestMapping("/getProductList")
    public String getProductList(Model model) {
        // 获取产品列表的逻辑
        List<Product> productList = productService.getAllProducts();

        // 将产品列表放入模型中，以便在视图中显示
        model.addAttribute("productList", productList);

        // 返回视图的逻辑名称
        return "productList";
    }



}
