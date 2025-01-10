public interface AbstractChairFactory { //Этот шаблон снимает с себя ответственность за создание экземпляра класса из клиентской программы в класс фабрики.
    VictorianChair createVictorianChair();
    MagicChair createMagicChair();
    FunctionalChair createFunctionalChair();
}