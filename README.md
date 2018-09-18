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
`$ cd vagrant_[role]`  
`$ vagrant up`  

Click on the corresponding desktop shortcut for access to either the Eclipse workbench IBW code (developer) or the IBW workbench (user) itself.  

## Shutdown
`$ vagrant halt`  

## Troubleshooting
If any part of the launch process breaks, consider reprovisioning the machine by first destroying the current Vagrant resources and then relaunching the setup.  
`$ vagrant destroy`  
`$ vagrant up`  

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License
[MIT](https://choosealicense.com/licenses/mit/)