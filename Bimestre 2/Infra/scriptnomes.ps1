foreach ($nome in $(Get-Content -Path .\lista_nomes.txt)) {
    <# Write-Output "O nome e $nome" #>   
    if ($nome -eq "Hayleigh") {
        Write-Output "Encontrou $nome"
      } else {
         $outrosNomes++
      }
}
Write-Output "o script percorreu $outrosNomes ate encontrar o certo"


  
  