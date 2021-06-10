<script>

var cont_morador = document.getElementById('morador');
var cont_administrador = document.getElementById('administrador');
var cont_unidade = document.getElementById('unidade');
var cont_prestador = document.getElementById('prestador');
var cont_locais = document.getElementById('locais');

function validaCampo(){

if(document.cadastro.nome.value==""){

alert("O Campo nome Ã© obrigatÃ³rio!");

return false;

}
else
if(document.cadastro.email.value=="")
{
alert("O Campo email Ã© obrigatÃ³rio!");
return false;
}
else
if(document.cadastro.senha.value=="")
{
alert("Digite uma senha!");
return false;
}
else
if(document.cadastro.senha.value=="")
{
alert("Digite uma senha!");
return false;
}
else
return true;
}

</script>

