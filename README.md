# Infobiotics Workbench - Computational Framework for Systems and Synthetic Biology

**Infobiotics Workbench (IBW)** is a user-friendly, integrated and scalable computational environment for the computer-aided design of synthetic biological systems. 
It supports an iterative workflow that begins with specification of the desired synthetic system, followed by simulation and verification of the system in high-performance environments and ending with the eventual compilation of the system specification into a genetic construct. 
This synergy is being achieved by integrating several state of the art features, such as:
- The **Infobiotics Language (IBL)** - an expressive modelling language for synthetic biology, that embeds the iterative design-test-build development life-cycle of a synthetic biological entity into one unifying framework;
- A **stochastic simulator** that implements all the variants of Gillespie’s stochastic simulation algorithms (SSA);
- A **parallel stochastic simulator**, based on a GPU implementation of the Gillespie SSA, able to execute computationally-demanding simulations in a high-performnace computing environemnt;
- A **verification**, embedding various model checking tools, facilitating the verification of properties and design requirements by using natural language queries;
- A **biocompilation** module, facilitating an automated compilation of a specified synthetic circuit into eventual genetic sequence information;
- **Import/export** mechanisms from/to community-approved data exchange formats, i.e. **SBOL** and **SBML**.

## Prerequisites

1. Operating System: [Ubuntu 18.04 LTS](https://releases.ubuntu.com/18.04.5/);
2. Oracle Java JDK 8: 
```sh
# add the PPA repository
sudo add-apt-repository ppa:webupd8team/java

# install JDK8 and set as default
sudo apt-get install oracle-java8-installer
sudo apt-get install oracle-java8-set-default
```
3. [Eclipse IDE for RCP and RAP Developers](https://www.eclipse.org/downloads/packages/release/2020-06/r/eclipse-ide-rcp-and-rap-developers).

## Development Environment Setup
Infobiotics Workbench is a synthetic biology IDE built on top of the Eclipse Platform. Please follow the instructions below on how to set up your development environment and run IBW from source code:
1. **Install** the following **packages** into the **Eclipse IDE**, by using the *Help -> Install New Software* menu:
   - *Xtend IDE 2.22.0*, *Xtext Complete SDK 2.22.0*, *Xtext Redistributable 2.22.0* and *Xtend Library for GWT 2.10.0* from [http://download.eclipse.org/modeling/tmf/xtext/updates/composite/releases/](http://download.eclipse.org/modeling/tmf/xtext/updates/composite/releases/);
   - *EMF - Eclipse Modeling Framework SDK 2.22.0* from [http://download.eclipse.org/modeling/emf/emf/updates/](http://download.eclipse.org/modeling/emf/emf/updates/);
   - *Xtext Antlr Runtime Feature 2.1.1* and *Xtext Antlr SDK Feature 2.1.1* from [http://download.itemis.com/updates/](http://download.itemis.com/updates/).
2. **Import** the **IBW source code** into the current workspace, by using *File -> Import -> Existing Projects into Workspace* and select all the available projects from the `develop` branch of this Git repository;
3. **Generate** the variuos **Xtext/EMF artifacts**, as below:
   - Right click on *roadblock.xtext.ibl/src/roadblock.xtext.ibl/Ibl.xtext* -> *Run As* -> *Generate Xtext Artifacts*;
   - Open the *roadblock.emf.ibl/model/ibl.genmodel* file. Right click on the *Ibl* (root node) of the EMF model -> *Generate Model Code*;
   - Open the *roadblock.emf.bioparts/model/bioparts.genmodel* file. Right click on the *Bioparts* (root node) of the EMF model -> *Generate Model Code*.
4. **Verify the setup** by right-clicking on the *roadblock.ibw* project -> *Run As* -> *Eclipse Application*. At this point, IBW should open up in the form of an IDE based on the Eclipse Platform.


## Usage
Please refer to the [infobiotics.org](http://infobiotics.org/) website on how to download and use Infobiotics Workbench.

## License
[MIT](LICENSE)
