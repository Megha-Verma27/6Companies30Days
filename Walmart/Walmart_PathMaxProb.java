package com.company;
import java.util.*;
public class Walmart_PathMaxProb {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        double prob[] = new double[n];
        Arrays.fill(prob, Double.MIN_VALUE);


        ArrayList<PriorityQueue<double[]>> adj = new ArrayList<>(edges.length*2);
        for(int i = 0; i < n; i++)
            adj.add(new PriorityQueue<>((a, b) -> Double.compare(a[1], b[1])));

        for(int i = 0; i < edges.length; i++) {
            adj.get(edges[i][0]).add(new double[]{edges[i][1], succProb[i]});
            adj.get(edges[i][1]).add(new double[]{edges[i][0], succProb[i]});
        }

        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        prob[start] = 1;
        while(!q.isEmpty()) {
            int s = q.poll();

            for(double[] edge : adj.get(s)) {
                if (prob[s] * edge[1] > prob[(int)edge[0]]) {
                    prob[(int)edge[0]] = prob[s] * edge[1];
                    q.offer((int)edge[0]);
                }
            }
        }
        return prob[end];
    }
}
