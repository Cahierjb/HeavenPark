<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

	<title>Booking Form HTML Template</title>

	<!-- Google font -->
	<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet">

	<!-- Bootstrap -->
	<link type="text/css" rel="stylesheet" href="css/bootstrap.min.css" />

	<!-- Custom stlylesheet -->
	<link type="text/css" rel="stylesheet" href="css/style.css" />

	<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
	<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
	<!--[if lt IE 9]>
		  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
		  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
		<![endif]-->

</head>

<body>
	<div id="booking" class="section">
		<div class="section-center">
			<div class="container">
				<div class="row">
					<div class="booking-form">
						<div class="form-header">
							<h1>HeavenPark</h1>
							<span class="form-label">Pour profiter d'une escapade en toute tranquillité</span>
						</div>
						<s:form action="Validate">
							<div class="row">
								<div class="col-sm-6">
									<div class="form-group">
									    <span class="form-label">Immatriculation</span>
                                        <input class="form-control" type="text" name="immatriculation" placeholder="Immatriculation du véhicule">
									</div>
								</div>
								<div class="col-sm-6">
									<div class="form-group">
										<span class="form-label">Couleur</span>
                                        <input class="form-control" type="text" name="couleur" placeholder="Important pour la retrouver de loin">
									</div>
								</div>
							</div>
							<div class="row">
                                <div class="col-sm-6">
                                    <div class="form-group">
                                        <span class="form-label">Marque</span>
                                        <input class="form-control" type="text" name="marque" placeholder="Plutot Ferrari ou Lambo ?">
                                    </div>
                                </div>
                                <div class="col-sm-6">
                                    <div class="form-group">
                                        <span class="form-label">Modele</span>
                                        <input class="form-control" type="text" name="modele" placeholder="La plus rapide ou la plus belle">
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-sm-6">
                                    <div class="form-group">
                                        <span class="form-label">Type de véhicule</span>
                                        <input class="form-control" type="text" name="type" placeholder="fast or furious ?">
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <span class="form-label">Parking</span>
                                <input class="form-control" type="text" name="Parking" placeholder="Les bleus">
                            </div>
                            <div class="row">
                                <div class="col-sm-6">
                                    <div class="form-group">
                                        <span class="form-label">Etage</span>
                                        <input class="form-control" type="text" name="etage" placeholder="Les bleus">
                                    </div>
                                </div>
                                <div class="col-sm-6">
                                    <div class="form-group">
                                        <span class="form-label">Allée</span>
                                        <input class="form-control" type="text" name="allee" placeholder="Les bleus">
                                    </div>
                                </div>
                            </div>
							<div class="form-btn">
								<s:submit value="Valider" class="login100-form-btn"/>
							</div>
						</s:form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body><!-- This templates was made by Colorlib (https://colorlib.com) -->

</html>