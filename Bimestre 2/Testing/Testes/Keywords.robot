*** Settings ***
Resource    ./Variables.robot
*** Keywords ***
Abrir o site da loja
    Open Browser    ${URL}    ${NAVEGADOR}

Fazer login no site da loja
    Wait Until Element is Visible    ${LOGIN}         10
    Input Text                       ${LOGIN}         standard_user
    Input Text                       ${SENHA}         secret_sauce
    Click Element                    ${BOTAOLOGIN}

Abrir os detalhes do produto "Sauce Labs Bolt T-Shirt"
    Wait Until Element is Visible    ${BOLT}          10
    Click Element                    ${BOLT}

Adicionar o produto "Sauce Labs Bolt T-Shirt" ao carrinho
    Click Element                    ${ADICIONARBOLT}    

Abrir o carrinho de compras
    Click Element                    ${CARRINHO}

Clicar em "Checkout"
    Click Element                    ${CHECKOUT}

Preencher informações do cliente e clicar em "Continue"
    Input Text                       ${FIRSTNAME}     Caio
    Input Text                       ${LASTNAME}      Castro
    Input Text                       ${POSTALCODE}    00000
    Click Element                    ${CONTINUE}

Confirmar se o valor final da compra é de $17.27 e clicar no botão "Finish"
    Element Should Contain           ${ELEMENTO}      $17.27
    Click Element                    ${FINISH}
Verificar se a frase "THANK YOU FOR YOUR ORDER" está sendo exibida
    Element Should Contain           ${MENSAGEM}      THANK YOU FOR YOUR ORDER