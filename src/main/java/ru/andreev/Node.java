package ru.andreev;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode(exclude = "friends")
public class Node {

    private String name;
    private Set<Node> friends;

    public Node(String name) {
        this.name = name;
        this.friends = new HashSet<>();
    }

}
