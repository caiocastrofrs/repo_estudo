*** Variables ***
${BOTAOID}              id=idExample
${BOTAOCLASSNAME}       class=buttonClass
${BOTAONAME}            name=button1
${BOTAOLINK}            Click me using this link text!
${SITE}                 https://ultimateqa.com/simple-html-elements-for-automation/
${NAVEGADOR}            chrome
${GENERO}               gender  
${OUTROS}               other
${CHECKBOX}             name=vehicle
${DROPDOWN}             css=#post-909 > div > div.et-l.et-l--post > div > div.et_pb_section.et_pb_section_2.et_section_regular > div > div.et_pb_column.et_pb_column_1_3.et_pb_column_4.et_pb_css_mix_blend_mode_passthrough > div.et_pb_module.et_pb_blurb.et_pb_blurb_8.et_pb_text_align_left.et_pb_blurb_position_top.et_pb_bg_layout_light > div > div > div > select
${CARRO}                opel
*** Keywords ***    
Abrir o site UltimateQA
    Open Browser                    ${SITE}             ${NAVEGADOR}
    Maximize Browser Window
Clicar no botão usando "ID"
    Click Element                   ${BOTAOID}
Clicar no botão usando "Classname"
    Click Element                   ${BOTAOCLASSNAME}
Clicar no botão usando "Name"
    Click Element                   ${BOTAONAME}
Clicar no botão usando "LinkText"
    Click Link                      ${BOTAOLINK}
Selecionar o radio button "Other"
    Execute Javascript              window.scrollTo(0,800)
    Select Radio Button             ${GENERO}   ${OUTROS}
Selecionar o checkbox "Bike"
    Select Checkbox                 ${CHECKBOX}
Selecionar o item "Audi" do menu dropdown
    Select From List By Value       ${DROPDOWN} ${CARRO}