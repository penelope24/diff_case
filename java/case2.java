package java;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

import org.w3c.dom.Node;

public class case2 {
    final Deque<Node> visiting = new ArrayDeque<>();
    final Deque<Node> visited = new ArrayDeque<>();

    public BreadthFirstTraversal(MethodDeclaration n) {
        super(n);
    }

    public Set<BlockStmt> collectBlockStmts() {
        Set<BlockStmt> res = new HashSet<>();
        visiting.add(n);
        while (!visiting.isEmpty()) {
            
        }
        return res;
    }
}
