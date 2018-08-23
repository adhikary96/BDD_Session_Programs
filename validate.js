function validate(){
	var name = document.getElementById("username").value;
	console.log(name);
	var pass = document.getElementById("password").value;
	console.log(pass);
	
	if(name==""){
		alert("Username cannot be blank");
	}
	else if(pass==""){
			alert("Password cannot be blank");
		}
	else if(name=="admin" && pass=="admin"){
		alert("Login Successful");
	}
	else{
		alert("Login Failed");
	}	
}