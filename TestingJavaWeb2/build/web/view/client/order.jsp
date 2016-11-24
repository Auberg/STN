<%-- 
    Document   : newjsp
    Created on : Oct 22, 2016, 11:19:25 AM
    Author     : Steven Christian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Client - request item</title>        
    </head>
    <body>
        <script>
            function updatePrice() {
                var price = document.getElementById("form-order-item_price").value;
                var quantity = document.getElementById("form-order-item_quantity").value;
                var t_price = document.getElementById("form-order-item_total");
                if ((price.length > 0) && (quantity.length > 0)) {
                    t_price.value = parseInt(price) * parseInt(quantity);
                }
            }
        </script>
        <div id="form-placeholder">
            <form name="order" id="form-order" method="post" action="order.jsp">
                <table id="form-order-table">
                    <tr>
                        <td>Item name</td>
                        <td><input type="text" name="item_name" id="form-order-item_name" required="true"/></td>
                    </tr>
                    <tr>
                        <td>Item price</td>
                        <td><input type="number" name="item_price" id="form-order-item_price" required="true" onkeyup="updatePrice()"/></td>
                    </tr>
                    <tr>
                        <td>Item quantity</td>
                        <td><input type="number" name="item_quantity" id="form-order-item_quantity" required="true" onkeyup="updatePrice()"/></td>
                    </tr>
                    <tr>
                        <td>Total price</td>
                        <td><input type="number" name="item_total" id="form-order-item_total" value="0" disabled=""/></td>
                    </tr>
                    <tr>
                        <td colspan="2"><input type="button" name="form-order-submit" value="Submit"/></td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>
