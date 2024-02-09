<!doctype html>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<html lang="en">

<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
        integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Hello, world!</title>
</head>

<body class="" style="background: #e2e2e2;">
    <div class="container mt-4">
        <div class="row">
            <div class="col-md-8 offset-md-2">
                <div class="card">
                    <div class="card-body">
                        <h3 class="text-center">Complex Form</h3>

						<div class="alert alert-danger" role="alert"> 
							<form:errors path="student12.*"/>
						</div>
							
						<form action="handleform" method="post">
                            <div class="form-group">
                                <label>Your Name</label>
                                <input class="form-control" type="text" name="userName"
                                    placeholder="Enter your Name here">
                            </div>

                            <div class="form-group">
                                <label>Your ID</label>
                                <input class="form-control" type="text" name="userId" placeholder="Enter your ID here">
                            </div>

                            <div class="form-group">
                                <label>Your DOB</label>
                                <input class="form-control" type="text" name="userDOB"
                                    placeholder="yyyy/mm/dd">
                            </div>

                            <div class="form-group">
                                <label>Example Course</label>
                                <select name="courses" class="form-control" multiple="multiple">
                                    <option>JavaScript</option>
                                    <option>Spring Boot</option>
                                    <option>Angular</option>
                                    <option>Python</option>
                                </select>
                            </div>

                            <label>Select Gender: </label>
                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" name="gender" id="gender" value="Male">
                                <label class="form-check-label" for="Male">Male</label>
                            </div>
                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" name="gender" id="gender" value="Female">
                                <label class="form-check-label" for="Female">Female</label>
                            </div>

                            <div class="form-group">
                                <select id="courses" name="studentType">
                                    <option value="old Student">Old Student</option>
                                    <option value="New Student">New Student</option>
                                </select>
                            </div>
                            
                            <div class="card">
                            	<div class="card-body">
                            		<div class="form-group">
                            			<input class="form-control" type="text" placeholder="Enter street name" name="address.street">
                            		</div>
                            		
                            		<div class="form-group">
                            			<input class="form-control" type="text" placeholder="Enter city name" name="address.city">
                            		</div>
                            	</div>
                            </div>

                            <div class="container text-center">
                                <button class="btn btn-success">Submit</button>
                            </div>

                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>
</body>

</html>