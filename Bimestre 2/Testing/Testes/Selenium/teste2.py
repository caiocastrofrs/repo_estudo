from selenium import webdriver

driver = webdriver.Chrome()
driver.get("http://mercadolivre.com.br")


CAMPO_BUSCA = driver.find_element_by_css_selector("body > header > div > form > input").send_keys("Iphone 12")
LUPA  = driver.find_element_by_css_selector("body > header > div > form > button").click()
PRIMEIRORESULTADO = driver.find_element_by_css_selector("#root-app > div > div > section > ol > li:nth-child(1) > div > div > div.ui-search-result__content-wrapper > div.ui-search-item__group.ui-search-item__group--title > a > h2").click()
IPHONE64 = driver.find_element_by_css_selector(".ui-pdp-variations > div:nth-child(1) > div:nth-child(1) > a:nth-child(4) > p:nth-child(1)").click()
CLICKCOOKIE = driver.find_element_by_css_selector("#newCookieDisclaimerButton").click()
ADDCARRINHO = driver.find_element_by_css_selector("div.ui-pdp-actions:nth-child(5) > div:nth-child(1) > button:nth-child(2) > span:nth-child(1)").click()
print('PASS')
""" driver.quit() """