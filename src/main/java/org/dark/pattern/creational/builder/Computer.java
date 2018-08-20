package org.dark.pattern.creational.builder;

import lombok.Data;
import org.springframework.boot.test.autoconfigure.data.neo4j.DataNeo4jTest;

/**
 * @author xiaozefeng
 * @date 2018/8/20 下午2:28
 */
@Data
public class Computer {
    private String cpu;

    private String mainBoard;


    public Computer(ComputerBuilder computerBuilder) {
        this.cpu = computerBuilder.cpu;
        this.mainBoard = computerBuilder.mainBoard;
    }

    public static class ComputerBuilder {
        private String cpu;

        private String mainBoard;

        public ComputerBuilder buildCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public ComputerBuilder buildMainBoard(String mainBoard) {
            this.mainBoard = mainBoard;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }

    }

}
