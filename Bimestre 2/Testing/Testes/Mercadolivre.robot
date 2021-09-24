*** settings ***
library  SeleniumLibrary
*** variables ***

*** test case ***
Mercado Livre 
    Acessar o site do Mercado Livre
    Faça uma busca por Iphone 12
    Clicar no primeiro resultado da busca
*** keywords ***
Acessar o site do Mercado Livre
  Open Browser http://mercadolivre.com.br brave

Faça uma busca por Iphone 12
  Input Text css=.nav-search-input iPhone12
  Click Element css=.nav-icon-search

Clicar no primeiro resultado da busca
  Click Element css=li.ui-search-layout__item:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > a:nth-child(1) > h2:nth-child(1)
  Close Browser