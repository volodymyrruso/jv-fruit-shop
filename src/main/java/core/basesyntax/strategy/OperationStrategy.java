package core.basesyntax.strategy;

import core.basesyntax.model.FruitModel;
import core.basesyntax.strategy.handler.OperationHandler;

public interface OperationStrategy {

   OperationHandler getHandler(FruitModel fruitModel);
}