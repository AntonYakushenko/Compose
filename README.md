# Compose

Для генерации allure отчета и последующего его просмотра использовать команду

adb exec-out run-as com.example.compose sh -c 'cd /data/data/com.example.compose/files 
&& tar cf - allure-results' > allure-results.tar && tar xvpf allure-results.tar && allure serve
