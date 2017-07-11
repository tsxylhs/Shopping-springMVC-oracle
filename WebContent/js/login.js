jQuery(function($) {
    localStorage.setItem("name", null);
    //if (localStorage.key.name === null) {
        $('#loginbtn').on('click', function() {
            var name = $('#inputname').val();
            var password = $('#inputPassword').val();
            alert(name + "" + password);
            let user = {
                username: name,
                userpassword: password

            }
            alert("adf");

            console.log(user);
            $.post('shoppinglogin', user, (data) => {
                $('#checkout-collapse1').hide();
                $('#inputLastname').val(data.user.username);
               
            //   localStorage.setItem("name", data.user.username);
              //  alert(​localStorage.key.name);

            }, "json")
        })
//
  //  }
});