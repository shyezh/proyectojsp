
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>$Title$</title>
    </head>
    <body>
    
    <br/>
    <table >
        <td datasrc="#1001">   <span datafld="nombre"></span></td>
        <td datasrc="#1001">   <span datafld="nombre"></span></td>
    </table>
    <form action="controlador">
        nom de projecte       <input type="text" name="nom" required=""><br/>
        temps de projecte     <input type="numer" name="temps" required=""><br/>
        tasque1 nom           <input type="text" name="ntasque1" required=""><br/>
        tasque1 durada        <input type="numer" name="dutasque1" required=""><br/>
        tasque2 nom           <input type="text" name="ntasque2" required=""><br/>
        tasque2 durada        <input type="numer" name="dutasque2" required=""><br/>
        tasque3 nom           <input type="text" name="ntasque3" required=""><br/>
        tasque3 durada        <input type="numer" name="dutasque3" required=""><br/>
            
            
      <%--  tasque1 descripcio    <input type="text" name="dtasque1"><br/> 
        tasque1 realizat      <input type="text" name="rtasque1"><br/> 
        tasque2 descripcio    <input type="text" name="dtasque2"><br/> 
        tasque2 realizado     <input type="text" name="rtasque2"><br/> 
        tasque3 descripcio    <input type="text" name="dtasque3"><br/> 
        tasque3 realizado     <input type="text" name="rtasques3"><br/> --%>
        <input type="submit" name="envia" value="envia" />
    </form>
</body>
</html>
