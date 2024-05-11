package tests;

import graphs.MyGraph;

public class TestGraph {
    public static void main(String[] args) {
        MyGraph<String> socialNetwork = new MyGraph<>();

        socialNetwork.addVertex("Timmy");
        socialNetwork.addVertex("Tommy");
        socialNetwork.addVertex("Billy");
        socialNetwork.addVertex("Willy");
        socialNetwork.addVertex("Rob");
        socialNetwork.addVertex("Bob");

        socialNetwork.addEdge("Timmy", "Tommy");
        socialNetwork.addEdge("Billy", "Tommy");
        socialNetwork.addEdge("Billy", "Willy");
        socialNetwork.addEdge("Rob", "Bob");
        socialNetwork.addEdge("Bob", "Timmy");
        socialNetwork.addEdge("Timmy", "Tommy");
        socialNetwork.addEdge("Timmy", "Billy");

        System.out.println(socialNetwork);
    }
}
