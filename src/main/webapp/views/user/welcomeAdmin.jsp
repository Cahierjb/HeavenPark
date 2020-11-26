<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="css/styleAdmin.css" />
</head>
<body>
 <nav>
  <a href="#third"><i class="far fa-parking"></i></a>
   <a href="#first"><i class="far fa-file"></i></a>
   <a href="#second"><i class="fas fa-user"></i></a>
   <a href="#fourth"><i class="far fa-address-card"></i></a> <!-- pas utilisé -->
 </nav>
  
<div class= 'container'> 
  <section id= 'first'>
  
    <h1>Liste des parking</h1>
    <div>
		<table>
		   <tr>
		      <th>Prénom</th>
		      <th>Nom</th>
		      <th>Profession</th>
		   </tr>
		   <tr>
		      <td>Mike</td>
		      <td>Stuntman</td>
		      <td>Cascadeur</td>
		   </tr>
		   <tr>
		      <td>Mister</td>
		      <td>Pink</td>
		      <td>Gangster</td>
		   </tr>
		</table>
	</div>
  </section>
  
  <section id= 'second'>
    <h1>Liste des users et voitures</h1>
  </section>
  
 <section id= 'third'>
   <h1>Création de parking</h1>
  </section>
  
 <section id= 'fourth'>
   <h1>Fourth</h1>
  </section>
</div>
</body>
</html>