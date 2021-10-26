#TURMA 3
#CAIO CASTRO
*** Variables ***

${URL}                  https://www.hurb.com/br
${NAVEGADOR}            chrome
${BOTAOCOOKIE}          id=CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll
${BOTAOPACOTES}         css=#__next > div.Header_Header__1jiZz > div.hrc-2LOsj > div > div > div.h-91nvuq > div > button:nth-child(2) > span
${INPUTPESQUISA}        id=downshift-1-input
${BOTAOPESQUISAR}       css=#__next > div.Header_Header__1jiZz > div.hrc-2LOsj > div > div > div.hrc-2_yd0.hrc-3T0_Y > button > span
${OPCAOPACOTE}          css=#__next > div > main > div.ResultsCardsContainer_ResultsCardContainer__1jtiB > a:nth-child(1) > div.hrc-2MRhP.hrc-oxPyE > div:nth-child(1) > h3
${ESCOLHEROPCAO}        css=body > div:nth-child(4) > section > div.box-offer-top.box-nopadding.col-sm-6.col-md-6 > div > section.box-offer-main.pull-left > div:nth-child(5) > div.pull-left.first-box > button
${COMPRAR}              css=#offer-options > div.offer-options--items > div:nth-child(4) > div.row.flex > div.col-xs-12.col-sm-4.col-md-4.offer-options--box-right.main-package > div > div.col-xs-12.col-sm-7.col-md-7.offer-options--box.offer-options--box-price.flex > div:nth-child(2) > div:nth-child(4) > a
${EMAIL}                id=itxEmail
${NOME}                 css=#paymentMethods__bill > section > div:nth-child(2) > div:nth-child(1) > div > input
${CPF}                  css=#paymentMethods__bill > section > div:nth-child(2) > div:nth-child(2) > div > input
${CELULAR}              css=#paymentMethods__bill > section > div:nth-child(2) > div:nth-child(3) > div > input
${BOLETO}               css=#ui-id-1 > span    
${MARCARCHECKBOX}       xpath=//*[@id="cancellation-policy"]
${CANCELAMENTO}         css=#purchase-confirmation > div:nth-child(1) > div > div > div.free-cancellation-policy__message
${CONFIGURACAOVIAGEM}   css=body > div.container > div > div.col-md-4.col-sm-4.hidden-xs > div.summary > div:nth-child(7) > div > div > div:nth-child(2) > div.col-xs-8.col-sm-8.col-md-8.text-right
${DATAINICIO}           css=body > div.container > div > div.col-md-4.col-sm-4.hidden-xs > div.summary > div:nth-child(9) > div > div > div:nth-child(2) > div.col-xs-7.col-sm-7.col-md-7.text-right.booking-info__date-formatted.summary-highlight
${DATATERMINO}          css=body > div.container > div > div.col-md-4.col-sm-4.hidden-xs > div.summary > div:nth-child(9) > div > div > div:nth-child(3) > div.col-xs-7.col-sm-7.col-md-7.text-right.booking-info__date-formatted.summary-highlight
*** Keywords ***
Abrir o site do Hurb
    Open Browser                ${URL}  ${NAVEGADOR}
    Maximize Browser Window
Clicar em "Permitir todos os cookies"
    Sleep   4
    Click Element               ${BOTAOCOOKIE}

Selecionar a opção "Pacotes"
    Click Element               ${BOTAOPACOTES}
Buscar por alguma cidade turística (Ex: Buenos Aires, Florença, Orlando) e clicar em "Pesquisar"
    Input Text                  ${INPUTPESQUISA}        estados unidos
    Click Element               ${BOTAOPESQUISAR}
Selecionar um pacote de viagem
    Click Element               ${OPCAOPACOTE}
Clicar em "ESCOLHER OPÇÃO"
    Switch Window   NEW
    Click Element               ${ESCOLHEROPCAO}
Escolher uma opção de viagem e clicar em "COMPRAR"
    Sleep   1
    Click Element               ${COMPRAR}
Validar as informações da "Configuração" da viagem
    Element Should Contain      ${CONFIGURACAOVIAGEM}       7 Noites\n1 pessoa por pacote
Validar as informações do período da viagem
    Element Should Contain      ${DATAINICIO}       01 Ago 2023
    Element Should Contain      ${DATATERMINO}      30 Jun 2024
Selecionar a opção "Boleto parcelado"
    Click Element               ${BOLETO}
Preencher os dados de pagamento
    Execute JavaScript      window.scrollTo(0,400)
    Sleep   1
    Input Text                  ${NOME}     Caio Castro
    Input Text                  ${CPF}      705.127.670-09
    Input Text                  ${CELULAR}      11990000000

Marcar o checkbox "Li e aceito as condições de termos de uso e política de privacidade"
    Select Checkbox             ${MARCARCHECKBOX}
Validar a informação sobre cancelamento grátis
    Element Should Contain      ${CANCELAMENTO}     Cancelamento Grátis!