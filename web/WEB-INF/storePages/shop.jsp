﻿﻿﻿﻿﻿<%-- 
    Document   : shop
    Created on : Mar 17, 2017, 10:32:43 AM
    Author     : luan.nt
--%>
<%@page import="models.Products"%>
<%@page import="models.Categories"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<jsp:useBean id = "Products" class = "model.bussiness.ProductBussiness" 
             scope = "page"/>
<jsp:useBean id = "Categories" class = "model.bussiness.CategoryBussiness" 
             scope = "page"/>
<html>
    <head>
        <%@ page language="java" contentType="text/html; charset=UTF-8"
                 pageEncoding="UTF-16BE"%>
        <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
        <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
        <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
        <%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
        <title>Shop Page</title>
    </head>
    <body>
        <!--header-->
        <jsp:include page="header.jsp"></jsp:include>
        <jsp:include page="banner.jsp"></jsp:include>
            <div id="undefined-sticky-wrapper" class="sticky-wrapper" style="height: 60px;">
                <div class="mainmenu-area">
                    <div class="container">
                        <div class="row">
                            <div class="navbar-header">
                                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                                    <span class="sr-only">Toggle navigation</span>
                                    <span class="icon-bar"></span>
                                    <span class="icon-bar"></span>
                                    <span class="icon-bar"></span>
                                </button>
                            </div> 
                            <div class="navbar-collapse collapse">
                                <ul class="nav navbar-nav">
                                    <li><a href="home.htm">Home</a></li>
                                    <li class="dropdown active">
                                        <a class="dropdown-toggle" data-toggle="dropdown" href="shop.htm">Category
                                            <span class="caret"></span></a>
                                        <ul class="dropdown-menu">
                                        <%
                                            List<Categories> cate = Categories.getAllCategories();
                                            for (Categories c : cate) {
                                        %>
                                        <li><a href="shop.htm?category=<%=c.getCategoryId()%>"><%=c.getCategoryName()%></a></li>
                                            <%
                                                }
                                            %>
                                    </ul>
                                </li>
                                <li><a href="cart.htm">Cart</a></li>
                                <li><a href="checkout.htm">Checkout</a></li>
                            </ul>         
                        </div>  
                    </div>
                </div>
            </div>
        </div> <!-- End mainmenu area -->
        <!--banner-->
        <div class="product-big-title-area">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div class="product-bit-title text-center">
                            <%
                                String cateid = "";
                                if (request.getParameter("category") != null) {
                                    cateid = request.getParameter("category");
                                }
                                Categories category = new Categories();
                                for (Categories c : cate) {
                                    if (c.getCategoryId() == Integer.parseInt(cateid)) {
                                        category = c;
                                    }
                                }
                            %>
                            <h2><%=category.getCategoryName()%></h2>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="single-product-area">
            <div class="zigzag-bottom"></div>
            <div class="container">
                <div class="row">
                    <%
                        List<Products> productlist = Products.GetProductByCateID(cateid);
                        for (Products p : productlist) {
                    %>
                    <div class="col-md-3 col-sm-6">
                        <div class="single-shop-product">
                            <div class="product-upper">
                                <img src="<%=p.getImage()%>" alt="">
                            </div>
                            <h2><a href="product.htm?category=<%=p.getCategories().getCategoryId()%>&product=<%=p.getProductId()%>"><%=p.getProductName()%></a></h2>
                            <div class="product-carousel-price">
                                <ins>
                                    <fmt:formatNumber type = "number" maxFractionDigits = "0" value = "<%=p.getUnitPriceSale()%>" /><u>đ</u>
                                </ins>
                                <del>
                                    <fmt:formatNumber type = "number" maxFractionDigits = "0" value = "<%=p.getUnitPrice()%>" /><u>đ</u>
                                </del>
                            </div>  
                            <div class="product-option-shop">
                                <a class="add_to_cart_button" data-quantity="1" data-product_sku="" data-product_id="70" rel="nofollow" href="addCart.htm?command=plus&productid=<%=p.getProductId()%>">Add to cart</a>
                            </div>                       
                        </div>
                    </div>
                    <%
                        }
                    %>
                </div>
                <div class="row">
                    <div class="col-md-12">
                        <div class="product-pagination text-center">
                            <nav>
                                <ul class="pagination">
                                    <li>
                                        <a href="#" aria-label="Previous">
                                            <span aria-hidden="true">&laquo;</span>
                                        </a>
                                    </li>
                                    <li><a href="#">1</a></li>
                                    <li><a href="#">2</a></li>
                                    <li><a href="#">3</a></li>
                                    <li><a href="#">4</a></li>
                                    <li><a href="#">5</a></li>
                                    <li>
                                        <a href="#" aria-label="Next">
                                            <span aria-hidden="true">&raquo;</span>
                                        </a>
                                    </li>
                                </ul>
                            </nav>                        
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
