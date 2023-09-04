alert("ALERTA!!!")

//let VouF = true;
//console.log(typeOf(VouF));

//let nqualquer = 5;
//console.log(typeOf(nqualquer));

//let nome = "Wagner";
//console.log(typeOf(nome));

//let funcao = function () {};
//console.log(typeOf(funcao));

/*let funcaoo = () => {
    console.log("Sou uma Arrow Function");
};

funcaoo();*/

function calculadora() {
    const operacao = Number(prompt("Escolha o número da operação:\n 1-Soma(+)\n 2-Subtração(-)\n 3-Multiplicação(*)\n 4-Divisão Real(/)\n 5-Divisão Inteira(%)\n 6-Potenciação(**)"));

    if (!operacao || operacao >= 7) {
        alert("Escolha entre 1 e 6");
        calculadora();
    } else {
            let n1 = Number(prompt("Insira um número"));
            let n2 = Number(prompt("Insira outro número"));
            let resultado;

            if (!n1 || !n2) {
                alert("Digite um número");
                calculadora();
            } else {
                
                function soma(){
                    resultado = n1 + n2;
                    alert(`O resultado de ${n1}+${n2} é: ${resultado}`);
                    novaOpe();
                    }
            
                function subtracao(){
                    resultado = n1 - n2;
                    alert(`O resultado ${n1}-${n2} é: ${resultado}`);
                    novaOpe();
                }
               function multiplicao (){
                    resultado = n1 * n2;
                     alert(`O resultado de ${n1}x${n2} é: ${resultado}`);
                     novaOpe();
                }
            
                function divisaoReal (){
                    resultado = n1 / n2;
                    alert(`O resultado de ${n1}/${n2} é: ${resultado}`);
                    novaOpe();
                }
            
                function divisaoInteira(){
                    resultado = n1 % n2;
                    alert(`O resto da divisão entre ${n1} e ${n2} é: ${resultado}`);
                    novaOpe();
                }
            
                function potenciacao(){
                    resultado = n1 ** n2;
                    alert(`O número ${n1} elevado ao número ${n2} é: ${resultado}`);
                    novaOpe();
                }
            
                function novaOpe(){
                    let opcao = prompt("Deseja fazer nova operação?\n 1 - SIM\n 2 - NÃO");
                        
                    if (opcao == 1){
                        calculadora();
                    } else if (opcao == 2){
                        alert("Até a próxima!");
                    } else {
                        alert("Escolha entre 1 e 2!!");
                        novaOpe();
                    }
                }
            
                /*if (operacao == 1){
                    soma();
                } else if (operacao == 2){
                    subtracao();
                } else if (operacao == 3){
                    multiplicao();
                } else if (operacao == 4){
                    divisaoReal();
                } else if (operacao == 5){
                    divisaoInteira();
                } else if (operacao == 6){
                    potenciacao();
                }*/
                    switch(operacao){
                        case 1:
                            soma();
                            break;
                        case 2:
                            subtracao();
                            break;
                        case 3:
                            multiplicacao();
                            break;
                        case 4:
                            divisaoReal();
                            break;
                        case 5:
                            divisaoInteira();
                            break;
                        case 6:
                            potenciacao();
                            break;
                        
                    }
            }
        }
    }

calculadora();