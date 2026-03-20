1. Why printReceipt method in such design should be default?

-printReceipt()- default тому що це спільне поведінка для всіх об'єктів і не потрібно буде дублювати код (DRY -DONT REPEAT YOURSELF).

2 .Why validateAmount method in such design is static?

-validateAmount()- static тому що це утилітарна логіка(допоміжна та одразу с реалізацією) вона не залежить від об'єкту та однакова для всіх об'єктів.

3 .Why Payment Transaction class should be immutable?

-immutable- тому що нельзя буде змінити транзакцію після створення і це потокобезпека. (транзакция = факт, а не объект для изменений). 

4.Why Base Payment class is abstract?

-BasePayment- дає спільні поля та конструктор  

5. Should factory class PaymentFactory be final?

-PaymentFactory- повинен бути final, щоб не можна було його унаслідувати та ії не потрібно розширювати(это utility класс).

6.Should factory method createPayment be static?
-createPayment- потрібно зробити static, щоб не потрібно було створювати пустий об'єкт а можно було сразу визвати метод.
Без static:
PaymentFactory factory = new PaymentFactory();
factory.createPayment(...);
Со static:
PaymentFactory.createPayment(...);
