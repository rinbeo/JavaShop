<%-- 
    Document   : login
    Created on : Mar 17, 2017, 10:09:23 AM
    Author     : ngan.nv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Login</title>
    <link rel="stylesheet" href="../css/bootstrap.min.css" />
    </head>
   <div class="container">
    <div class="row vertical-offset-100">
    	<div class="col-md-4 col-md-offset-4">
    		<div class="panel panel-default">
			  	<div class="panel-heading">
			    	<h3 class="panel-title">Please sign in</h3>
			 	</div>
			  	<div class="panel-body">
                                    <form accept-charset="UTF-8" role="form" action="${pageContext.request.contextPath}/admin/actionlogin.htm" method="post">
                    <fieldset>
			    	  	<div class="form-group">
			    		    <input class="form-control" placeholder="Username" name="username" type="text">
			    		</div>
			    		<div class="form-group">
			    			<input class="form-control" placeholder="Password" name="password" type="password" value="">
			    		</div>
			    		<div class="checkbox">
			    	    	<label>
			    	    		<input name="remember" type="checkbox" value="Remember Me"> Remember Me
			    	    	</label>
			    	    </div>
			    		<input class="btn btn-lg btn-success btn-block" type="submit" value="Login">
			    	</fieldset>
			      	</form>
			    </div>
			</div>
		</div>
	</div>
</div>
    <style>
        body{
    background: url(http://mymaplist.com/img/parallax/back.png);
	background-color: #444;
    background: url(http://mymaplist.com/img/parallax/pinlayer2.png),url(http://mymaplist.com/img/parallax/pinlayer1.png),url(http://mymaplist.com/img/parallax/back.png);    
}

.vertical-offset-100{
    padding-top:100px;
}
    </style>
</html>
