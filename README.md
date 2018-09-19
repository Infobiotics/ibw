# Infobiotics Workbench

## Requirements
* [Vagrant](https://www.vagrantup.com/downloads.html)
* [Virtualbox](https://www.virtualbox.org/wiki/Downloads) 4.0 and up

## User Installation
`$ cd vagrant_user`  
`$ vagrant up`

## Developer Installation
`$ cd vagrant_developer`  
`$ vagrant up`

## Launch
Launch the START executable in a Vagrant IBW directory or execute the following commands from the base of the repository.
`$ cd vagrant_[role]`  
`$ vagrant up`  

Click on the corresponding desktop shortcut for access to either the Eclipse workbench IBW code (developer) or the IBW workbench (user) itself.  

## Shutdown
`$ vagrant halt`

## Troubleshooting
If any part of the launch process breaks, a complete Vagrant reset can be accomplished by executing the following comands in either Vagrant IBW directory.  
`$ vagrant destroy`  
`$ vagrant up`  

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License
[MIT](https://choosealicense.com/licenses/mit/)
