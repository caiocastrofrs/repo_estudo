*** Settings ***
Library         SeleniumLibrary
Test Setup      Abrir o site da loja
Test Teardown   Close Browser
Resource        ./Keywords.robot
*** Test Cases ***
[TESTE 0001 - Finalizando uma compra com usuário comum]
    Fazer login no site da loja
    Abrir os detalhes do produto "Sauce Labs Bolt T-Shirt"
    Adicionar o produto "Sauce Labs Bolt T-Shirt" ao carrinho
    Abrir o carrinho de compras
    Clicar em "Checkout"
    Preencher informações do cliente e clicar em "Continue"
    Confirmar se o valor final da compra é de $17.27 e clicar no botão "Finish"
    Verificar se a frase "THANK YOU FOR YOUR ORDER" está sendo exibida

