function gerar(){
    let seed = document.getElementById("seed");
    //let tamanhoNumber = Number(document.getElementById("tamanho").value);
	let tamanho = document.getElementById("tamanho");
    let form = document.getElementById("form");

    if (Number(tamanho.value) < 8) {tamanho.value = 8};
    if (Number(tamanho.value) > 20) {tamanho.value = 20};

    if(seed.value.length < 1){
        seed.focus(); alert("Preencha a chave")
    }else{
	
        form.submit();
    }
 
}