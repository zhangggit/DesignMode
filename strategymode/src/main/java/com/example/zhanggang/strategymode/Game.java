package com.example.zhanggang.strategymode;

/**
 * Created by zhanggang on 2017/10/16.
 * 定义一个游戏类  有攻击、防御、逃跑、技能四个方法
 */

public class Game {
    protected String name;
    protected BaseAttack attack;
    protected BaseFend fend;
    protected BaseRun run;
    protected BaseDisplay display;

    public Game setAttack(BaseAttack attack) {
        this.attack = attack;
        return this;
    }

    public Game setFend(BaseFend fend) {
        this.fend = fend;
        return this;
    }

    public Game setRun(BaseRun run) {
        this.run = run;
        return this;
    }

    public Game setDisplay(BaseDisplay display) {
        this.display = display;
        return this;
    }

    public void attack() {
        attack.attack();
    }

    public void fend() {
        fend.fend();
    }

    public void run() {
        run.run();
    }

    public void display() {
        display.diaplay();
    }

}
