package hattabi.youness;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import hattabi.youness.context.Context;
import hattabi.youness.strategy.Strategy;

public class Main {
    public static void main(String[] args) throws Exception {
        Context context = new Context();
        Scanner scanner = new Scanner(System.in);
        Map<String, Strategy> strategiesMap = new HashMap<>();
        Strategy strategy;

        while (true) {
            System.out.println("Quelle stratégie? : ");
            String str = scanner.nextLine();
            strategy = strategiesMap.get(str);
            if (strategy == null) {
                System.out.println("Création d'un nouvel objet de StrategyImpl"+str);
                strategy = (Strategy) Class.forName("hattabi.youness.strategy.StrategyImpl"+str).getConstructor().newInstance();
                strategiesMap.put(str, strategy);
            }
            context.setStrategy(strategy);
            context.effectuerOperation();
        }
    }
}