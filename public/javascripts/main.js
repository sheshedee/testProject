function validateForm() {
    var name = document.forms["myForm"]["name"].value;
    var password = document.forms["myForm"]["password"].value;

    if(!/^[a-zA-Z]+$/.test(name)){
            alert("Please enter a name with letters.");
            return false;
          }
    if (name.length < 8 || name.length > 50) {
            alert("Please enter a name between 8 and 50 characters.");
            return false;
          }
    if(/^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}$/.test(password)){
    alert("Please enter password with correct format")
              return regex.test(password);
              }
              return true;
}
