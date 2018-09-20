# Infobiotics Workbench
**Infobiotics workbench** is a computational framework implementing a synergy between *executable biology, multi-compartmental stochastic simulations, formal model analysis and structural/parameter model optimisation* for **computational systems and synthetic biology**. It provides a *user-friendly front-end* allowing the modeller to design in-silico experiments, analyse and visualise results using its four components:

* A **modelling language** based on *P systems* that allows modular and parsimonious multi-cellular model development including geometric information.
* A **multi-compartmental stochastic simulator** based on *Gillespie’s Stochastic Simulation Algorithm* for multi-cellular systems.
* **Formal model analysis** using the stochastic model checkers [PRISM](http://www.prismmodelchecker.org/) and [MC2](http://www.brc.dcs.gla.ac.uk/software/mc2/) for the study of *temporal and spatial model properties*.
* **Structural and parameter model optimisation** using *evolutionary algorithms* to automatically generate models whose dynamics match specified targets.

Our homepage can be found at http://infobiotics.org/, and you can download the full documentation [here](http://www.infobiotics.org/infobiotics-workbench/various/infobiotics.pdf).

## Requirements
* [Vagrant](https://www.vagrantup.com/downloads.html)
* [Virtualbox](https://www.virtualbox.org/wiki/Downloads) 4.0 and up

## Download
We use Vagrant to provide our software for all operating environments, which means all IBL and IBW development should occur in the Vagrant virtual machine environment. Creation, launch, and teardown of this environment is handled by Vagrant and detailed below.

### User
[User distribution](http://infobiotics.org/files/ibw-user.tar.gz) for runnable executable.

### Developer
[Developer distribution](http://infobiotics.org/files/ibw-developer.tar.gz) for compilable IBW source code.

### Source Code
[Code repository](http://github.com/FILLER) for IBW source code that is not provisioned and made runnable by a Vagrant virtual machine.

## Installation and Launch
Unzip and run the following command within the Vagrant distribution. Required software will be automatically installed the first time the command is executed, while subsequent executions will launch the existing Vagrant configuration for use.  
`$ vagrant up`

Click on the corresponding desktop shortcut within the Vagrant box for access to either the Eclipse workbench IBW code (developer) or the IBW workbench (user) itself.  

## Shutdown
`$ vagrant halt`

## Troubleshooting
If any part of the launch process breaks, a complete Vagrant reset can be accomplished by executing the following comands in the distribution.   
`$ vagrant destroy`  
`$ vagrant up`  

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License
[MIT](https://choosealicense.com/licenses/mit/)
