package ru.andreev;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Node {

    private String name;
    private Set<Node> friends;

    public Node(String name) {
        this.name = name;
        this.friends = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public Set<Node> getFriends() {
        return friends;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFriends(Set<Node> friends) {
        this.friends = friends;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Node node = (Node) o;
        return name.equals(node.name) && Objects.equals(friends, node.friends);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
