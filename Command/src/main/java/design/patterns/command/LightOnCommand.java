/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package design.patterns.command;

/**
 *
 * @author Marcos
 */
class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        setLight(light);
    }

    public void setLight(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
    
    @Override
    public void undo() {
        light.turnOff();
    }
}