Guia rápido – Subir arquivos para o GitHub usando Git Bash

Passo a passo organizado para enviar novos arquivos de um projeto local
para um repositório no GitHub usando o Git Bash.

1.  Acessar a pasta do projeto Comando:     
    
    cd “caminho/da/sua/pasta”

    Explicação: Entra na pasta onde estão os arquivos do projeto.
    Exemplo: cd “C:/Users/Osmar/Documents/meu-projeto”

2.  Verificar o status do repositório Comando:      
   
    git status 
    
    Explicação:
    Mostra os arquivos novos, modificados e não rastreados.

3.  Adicionar os novos arquivos Comando: 

    git add . 

    Explicação: Adiciona todos os arquivos novos ou modificados para o próximo commit. 
    Se quiser adicionar apenas alguns, use: 

    git add arquivo1.ext arquivo2.ext

4.  Criar o commit Comando: 

    git commit -m “Mensagem do commit”
 
    Explicação: Cria um ponto de versão com os arquivos adicionados. Use
    uma mensagem curta e descritiva, como: “Adicionando novos arquivos”

5.  Enviar para o repositório no GitHub Comando: 

    git push origin main

    Explicação: Envia os commits locais para o repositório remoto. Se o
    branch for master, use: 

    git push origin master

6.  Confirmar no GitHub (sem comando) Explicação: Acesse o site do
    GitHub e atualize a página do repositório para verificar se os
    arquivos foram enviados corretamente.


OBS: Se for a primeira vez que está subindo essa pasta (ou se acabou de criar o repositório), 
     você pode precisar executar antes: (um depois o outro)

    git init
    git branch -M master main
    git remote add origin https://github.com/seuusuario/seurepositorio.git

OBS: Para fazer a sua pasta no notebook receber algum arquivo que vc construiu no github web, 
ou seja, fazer o download da diferença e deixar as duas pastas iguais:  
Fazer o pull com rebase (para evitar conflitos)

     git pull --rebase origin main

Isso baixa as alterações que estão no GitHub e tenta combinar com o que está no seu PC.
Explicação resumida

      pull --rebase → sincroniza o que está no GitHub com seu projeto local.

      push → envia suas atualizações para o GitHub.
