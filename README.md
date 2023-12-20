### «Коллекция HashMap и HashSet»

#### Задание 1
Вашей задачей будет написание сервиса услуг доставки товаров по миру.

Адрес доставки будет задаваться двумя данными: страна (country) и город (city). Создайте для этих целей класс 
Address.

В main создайте несколько адресов и мапу costPerAddress, в которой ключом будет адрес, а значением — цена 
доставки 1 кг груза. Заполните мапу созданными адресами и произвольными значениями цен доставки по этим 
адресам.

Далее в цикле пользователь вводит заказы (или end). Каждый заказ состоит из трёх частей: страны, города и веса 
в кг доставляемого товара. В ответ нужно написать, что такой адрес не обслуживается, или написать стоимость 
доставки и общую сумму всех сделанных доставок.

#### Задание 2
Добавьте, кроме общей суммы, вывод информации о том, в какое количество уникальных стран были оформлены 
доставки. Уникальность означает, что если по России было отправлено, например, три заказа, то учитываться это 
должно как одна страна.