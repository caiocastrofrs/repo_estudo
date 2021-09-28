*** Settings ***
Library         SeleniumLibrary
Test Setup      Abrir o site UltimateQA
#Test Teardown   Close Browser
Resource        ./Ultimate.resource
*** Test Cases ***
Teste 01
    Clicar no botão usando "ID"

Teste 02
    Clicar no botão usando "Classname"

Teste 03
    Clicar no botão usando "Name"

Teste 04
    Clicar no botão usando "LinkText"

Teste 05
    Selecionar o radio button "Other"

Teste 06
    Selecionar o checkbox "Bike"

Teste 07
    Selecionar o item "Audi" do menu dropdown