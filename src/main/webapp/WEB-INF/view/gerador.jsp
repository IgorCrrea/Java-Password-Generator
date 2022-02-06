<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/" var="linkEntrada" />

<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Gerador de Senhas</title>
</head>
<body>
    <link rel="stylesheet" href="css/Style.css">
    <script src="js/Script.js"></script>
    <header>Gerador de Senhas</header>

    <div class="container">
        
        <form action="${linkEntrada }" id="form" method="post">
	        <input type="text" name="seed" id="seed" class="entrada" placeholder="Chave de geração." value="${seed}">
	        <input type="number" min="5" max="20" name="tamanho" id="tamanho" class="entrada" placeholder="Quantidade de caracteres (8 - 20)"  value="${tamanho}">
	        <input type="hidden" name="action" value="GeraSenha">
        </form>
        
        <button value="Gerar" class="btn" onclick="gerar()" >Gerar</button>
        <div class="container_saida bloquear-selecao" id="container_saida">Senha: <p id="saida" class="libera-selecao">${senha}</p></div>
        
    </div>

</body>
</html>
