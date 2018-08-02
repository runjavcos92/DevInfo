/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(".dropdown-menu li a").click(function(){
  var selText = $(this).text();
  $(this).parents('.btn-group').find('.dropdown-toggle').html(selText+' <span class="caret"></span>');
});


function validar (){
    var input1 = document.getElementById("autor").value;
    var input2 = document.getElementById("correspondiente").value;
    if(input1 == null || input1.length == 0){
        return false;
    }  
}