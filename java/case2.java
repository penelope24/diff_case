package java;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;
// add import 
// add import 

import org.w3c.dom.Node;

public class case2 {
    final Deque<Node> visiting = new ArrayDeque<>();
    final Deque<Node> visited = new ArrayDeque<>();

    public BreadthFirstTraversal(MethodDeclaration n) {
        super(n);
    }

    public Set<BlockStmt> collectBlockStmts() {
        // add if check
        Set<BlockStmt> res = new HashSet<>();
        visiting.add(n);
        while (!visiting.isEmpty()) {
            Node node = visiting.pop();
            if (node instanceof BlockStmt) {
                res.add((BlockStmt) node);
            }
            node.getChildNodes().forEach(child -> {
                if (visited.add(child)) {
                    // add if check
                    visiting.add(child); // add comment
                }
            });
        }
        return res;
    }
}
