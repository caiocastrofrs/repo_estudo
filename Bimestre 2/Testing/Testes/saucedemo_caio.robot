#CAIO CASTRO 
*** Settings ***
Library         SeleniumLibrary
Test Setup      Abrir o site da loja
Test Teardown   Close Browser
*** Variables ***
${URL}          http://saucedemo.com
${NAVEGADOR}            chrome
${USUARIO}              id=user-name
${SENHA}                id=password
${LOGIN}                id=login-button 
${DETALHES_PRODUTO}     css=#item_4_title_link > div  
${BOTAO_ADD_CARRINHO}   id=add-to-cart-sauce-labs-backpack
${CARRINHO_COMPRAS}     css=#shopping_cart_container > a
${REMOVER}              id=remove-sauce-labs-backpack
${CONTINUE_SHOPPING}    id=continue-shopping
${PRODUTO_JACKET}       id=add-to-cart-sauce-labs-fleece-jacket
${CHECKOUT}             id=checkout
${FIRSTNAME}            id=first-name
${LASTNAME}             id=last-name
${ZIPCODE}              id=postal-code
${CONTINUE}             id=continue
${VALOR}                css=#checkout_summary_container > div > div.summary_info > div.summary_total_label
${FINISH}               id=finish
${MENSAGEM}             css=#checkout_complete_container > h2
*** Test Cases ***
[TESTE 01 - Finalizando uma compra com usuário comum]
    Fazer login no site com o usuário "standard_user"
    Acessar os detalhes do produto "Sauce Labs Backpack"
    Adicionar o produto "Sauce Labs Backpack" ao carrinho de compras
    Abrir o carrinho de compras
    Remover o produto "Sauce Labs Backpack" do carrinho de compras
    Clicar em "Continue Shopping" para voltar à Página Inicial
    Adicionar o produto "Sauce Labs Fleece Jacket" ao carrinho de compras
    Abrir o carrinho de compras novamente
    Clicar em "Checkout" para finalizar a compra
    Preencher os dados: PRIMEIRO NOME (FIRST NAME), SOBRENOME (LAST NAME) E CEP (POSTAL CODE)
    Clicar no botão "CONTINUE"
    Validar se o valor total cobrado é de "$53.99"
    Clicar no botão "FINISH"
    Validar que a compra foi realizada e a mensagem "THANK YOU FOR YOUR ORDER" está sendo exibida

*** Keywords ***
Abrir o site da loja
    Open Browser    ${URL}  ${NAVEGADOR}
    Maximize Browser Window

Fazer login no site com o usuário "standard_user"
    Input Text                  ${USUARIO}  standard_user
    Input Text                  ${SENHA}    secret_sauce
    Click Element               ${LOGIN}    

Acessar os detalhes do produto "Sauce Labs Backpack"
    Click Element               ${DETALHES_PRODUTO}

Adicionar o produto "Sauce Labs Backpack" ao carrinho de compras
    Click Element               ${BOTAO_ADD_CARRINHO}

Abrir o carrinho de compras
    Click Element               ${CARRINHO_COMPRAS}

Remover o produto "Sauce Labs Backpack" do carrinho de compras
    Click Element               ${REMOVER}

Clicar em "Continue Shopping" para voltar à Página Inicial
    Click Element               ${CONTINUE_SHOPPING}

Adicionar o produto "Sauce Labs Fleece Jacket" ao carrinho de compras
    Click Element               ${PRODUTO_JACKET}

Abrir o carrinho de compras novamente
    Click Element               ${CARRINHO_COMPRAS}

Clicar em "Checkout" para finalizar a compra
    Click Element               ${CHECKOUT}

Preencher os dados: PRIMEIRO NOME (FIRST NAME), SOBRENOME (LAST NAME) E CEP (POSTAL CODE)
    Input Text                  ${FIRSTNAME}    Caio
    Input Text                  ${LASTNAME}     Castro
    Input Text                  ${ZIPCODE}      00000

Clicar no botão "CONTINUE"
    Click Element               ${CONTINUE}

Validar se o valor total cobrado é de "$53.99"
    Element Should Contain      ${VALOR}    $53.99

Clicar no botão "FINISH"
    Click Element               ${FINISH}

Validar que a compra foi realizada e a mensagem "THANK YOU FOR YOUR ORDER" está sendo exibida
    Element Should Contain      ${MENSAGEM}     THANK YOU FOR YOUR ORDER