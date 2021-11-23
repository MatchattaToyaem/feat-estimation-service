# feat-gathering-data-backend 
## Project structure


* [main/](./src/main)
    * [java/](./src/main/java)
        * [feetarcestimation/](./src/main/java/feetarcestimation)
            * [service/](./src/main/java/feetarcestimation/service)
                * [config/](./src/main/java/feetarcestimation/service/config)
                    * [ImageType.java](./src/main/java/feetarcestimation/service/config/ImageType.java)
                    * [ShoeSizes.java](./src/main/java/feetarcestimation/service/config/ShoeSizes.java)
                * [controllers/](./src/main/java/feetarcestimation/service/controllers)
                    * [ping.java](./src/main/java/feetarcestimation/service/controllers/ping.java)
                    * [volunteerController.java](./src/main/java/feetarcestimation/service/controllers/volunteerController.java)
                    * [volunteerRawController.java](./src/main/java/feetarcestimation/service/controllers/volunteerRawController.java)
                * [datasource/](./src/main/java/feetarcestimation/service/datasource)
                    * [Datasource.java](./src/main/java/feetarcestimation/service/datasource/Datasource.java)
                * [event/](./src/main/java/feetarcestimation/service/event)
                    * [VolunteerListener.java](./src/main/java/feetarcestimation/service/event/VolunteerListener.java)
                * [models/](./src/main/java/feetarcestimation/service/models)
                    * [Raw/](./src/main/java/feetarcestimation/service/models/Raw)
                        * [CompressImageData.java](./src/main/java/feetarcestimation/service/models/Raw/CompressImageData.java)
                        * [CompressImageResponse.java](./src/main/java/feetarcestimation/service/models/Raw/CompressImageResponse.java)
                        * [Coordinate.java](./src/main/java/feetarcestimation/service/models/Raw/Coordinate.java)
                        * [Foot.java](./src/main/java/feetarcestimation/service/models/Raw/Foot.java)
                        * [ManualMeasurement.java](./src/main/java/feetarcestimation/service/models/Raw/ManualMeasurement.java)
                        * [ManualMeasurementComponent.java](./src/main/java/feetarcestimation/service/models/Raw/ManualMeasurementComponent.java)
                        * [RawData.java](./src/main/java/feetarcestimation/service/models/Raw/RawData.java)
                        * [RawFootData.java](./src/main/java/feetarcestimation/service/models/Raw/RawFootData.java)
                        * [Side.java](./src/main/java/feetarcestimation/service/models/Raw/Side.java)
                        * [Sole.java](./src/main/java/feetarcestimation/service/models/Raw/Sole.java)
                        * [Volunteer.java](./src/main/java/feetarcestimation/service/models/Raw/Volunteer.java)
                    * [DatabaseSequence.java](./src/main/java/feetarcestimation/service/models/DatabaseSequence.java)
                    * [Food.java](./src/main/java/feetarcestimation/service/models/Food.java)
                    * [Foot.java](./src/main/java/feetarcestimation/service/models/Foot.java)
                    * [Volunteer.java](./src/main/java/feetarcestimation/service/models/Volunteer.java)
                * [repositories/](./src/main/java/feetarcestimation/service/repositories)
                    * [rawVolunteerRepository.java](./src/main/java/feetarcestimation/service/repositories/rawVolunteerRepository.java)
                    * [volunteerRepository.java](./src/main/java/feetarcestimation/service/repositories/volunteerRepository.java)
                * [services/](./src/main/java/feetarcestimation/service/services)
                    * [volunteer/](./src/main/java/feetarcestimation/service/services/volunteer)
                        * [GetBase64Image.java](./src/main/java/feetarcestimation/service/services/volunteer/GetBase64Image.java)
                        * [SortById.java](./src/main/java/feetarcestimation/service/services/volunteer/SortById.java)
                        * [sortByDate.java](./src/main/java/feetarcestimation/service/services/volunteer/sortByDate.java)
                        * [update.java](./src/main/java/feetarcestimation/service/services/volunteer/update.java)
                    * [CompressImage.java](./src/main/java/feetarcestimation/service/services/CompressImage.java)
                    * [GetImageService.java](./src/main/java/feetarcestimation/service/services/GetImageService.java)
                    * [SaveImageService.java](./src/main/java/feetarcestimation/service/services/SaveImageService.java)
                    * [SequenceGeneratorService.java](./src/main/java/feetarcestimation/service/services/SequenceGeneratorService.java)
                * [utils/](./src/main/java/feetarcestimation/service/utils)
                    * [validation/](./src/main/java/feetarcestimation/service/utils/validation)
                        * [FootValidator.java](./src/main/java/feetarcestimation/service/utils/validation/FootValidator.java)
                        * [PreVolunteer.java](./src/main/java/feetarcestimation/service/utils/validation/PreVolunteer.java)
                    * [Base64ToStream.java](./src/main/java/feetarcestimation/service/utils/Base64ToStream.java)
                    * [Computing.java](./src/main/java/feetarcestimation/service/utils/Computing.java)
                    * [Publish.java](./src/main/java/feetarcestimation/service/utils/Publish.java)
                    * [ShoeSizeConverter.java](./src/main/java/feetarcestimation/service/utils/ShoeSizeConverter.java)
                * [ServiceApplication.java](./src/main/java/feetarcestimation/service/ServiceApplication.java)
    * [resources/](./src/main/resources)
        * [application.properties](./src/main/resources/application.properties)

### Config
In [config directory](./src/main/java/feetarcestimation/service/config), it contains all config files, such as image type, and shoe size.
### Controllers
In [controllers directory](./src/main/java/feetarcestimation/service/controllers), it contains all controllers file, which used to specify all api endpoints.
### Datasource
In [datasource directory](./src/main/java/feetarcestimation/service/datasource), it used to create connection between a database and this project.
### Event
In [event directory](./src/main/java/feetarcestimation/service/event), it contains event listener file, which used to do any event before save data into the database.
### Models
In [models directory](./src/main/java/feetarcestimation/service/models), it contains all necessary models.
### Repositories
In [repositories directory](./src/main/java/feetarcestimation/service/repositories), it contains all repositories file, which used to communicate between this project and the database.
### Services
In [services directory](./src/main/java/feetarcestimation/service/services), it contains all services, which used to perform an action that necessary for each endpoint.
### Utils
In [utils directory](./src/main/java/feetarcestimation/service/utils), it contains all utilities file, which use in service.

## How to start this project
- Option 1 : Run it by using intellij
- Option 2 : Run it by using docker-compose

### Option 1
1. Prepared mongo db by following this [instruction](https://hub.docker.com/_/mongo).
2. Import this project as maven project into intellij.
3. Set up environment variable. You can do it by following [this link](https://www.jetbrains.com/help/objc/add-environment-variables-and-program-arguments.html#add-environment-variables).
   - DATABASE_URL : mongodb://localhost:27017/
   - DATABASE : masterdata
4. Run it

### Option 2
1. Run this command.
```
docker-compose up -d
```

## Old data from NSTDA
[volunteer_finished.json](./volunteer_finished.json)
