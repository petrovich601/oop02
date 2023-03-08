//import java.util.List;

/**
 * 1. Интерфейс QueueBehaviour, который описывает логику очереди –
 * помещение в/освобождение из очереди, принятие/отдача заказа
 * 2. Интерфейс MarketBehaviour, который описывает логику магазина –
 * приход/уход покупателей, обновление состояния магазина
 * 3. Класс Market, который реализовывает два вышеуказанных интерфейса
 * и хранит в списке список людей в очереди в различных статусах
 */


public interface MarketBehavior {
    void acceptToMarket(Buyer actor);
    void releaseFromMarket(Buyer actor);
    void update();
}
