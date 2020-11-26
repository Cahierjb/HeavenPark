<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <!-- Required meta tags-->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="Colorlib Templates">
    <meta name="author" content="Colorlib">
    <meta name="keywords" content="Colorlib Templates">

    <!-- Title Page-->
    <title>Enregistrement</title>

    <!-- Icons font CSS-->
    <link href="../../vendor/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all">
   
    <!-- Font special for pages-->
    <link href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i" rel="stylesheet">

    <!-- ../../vendor CSS-->
    <link href="../../vendor/select2/select2.min.css" rel="stylesheet" type="text/css">
 
	
    <!-- Main CSS-->
    <link href="../../css/main_register.css" rel="stylesheet"type="text/css">
</head>

<body>
    <div class="page-wrapper bg-blue p-t-100 p-b-100 font-robo">
        <div class="wrapper wrapper--w680">
            <div class="card card-1">
                <div class="card-heading"></div>
                <div class="card-body">
                    <h2 class="title">DONNEZ NOUS VOS INFOS :)</h2>
                    <s:form action="Register">
                        <div class="input-group">
                        	<div class="row row-space">
                        		<div class="col-2">
                           			 <input class="input--style-1" type="text" placeholder="Nom" name="name">
                        		</div>
                        		<div class="col-3">
                           			 <input class="input--style-1" type="text" placeholder="Prénom" name="prenom">
                        		</div>
                        	</div>
                        </div>
                        <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <input class="input--style-1" type="text" placeholder="Naissance" name="birthday">
                                    
                                </div>
                            </div>
                           
                        </div>
                        <div class="input-group">
                             
                                    <input class="input--style-1 js-datepicker" type="text" placeholder="Email" name="email">
                            
                            
                        </div>
                        <div class="input-group">
                                    <input class="input--style-1 js-datepicker" type="text" placeholder="Mot de passe" name="password">
                        </div>
                        
                        <div class="p-t-20">
                           <s:submit value="S'enregistrer" class="btn btn--radius btn--green"/>
                        </div>
                    </s:form>
                </div>
            </div>
        </div>
    </div>

    <!-- Jquery JS-->
    
    <!-- ../../vendor JS-->
   

    <!-- Main JS-->

</body><!-- This templates was made by Colorlib (https://colorlib.com) -->

</html>
<!-- end document-->
